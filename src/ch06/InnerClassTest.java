package ch06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class InnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock(1000, false);
        clock.start();

        //keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program？");
        System.exit(0);
    }

    /**
     * A clock that prints the time in regular intervals
     */
    static class TalkingClock {
        private int interval;
        private boolean beep;

        /**
         * Constructs a talking clock
         *
         * @param interval the interval between messages (in milliseconds)
         * @param beep     true if the clock should beep
         */
        public TalkingClock(int interval, boolean beep) {
            this.interval = interval;
            this.beep = beep;
        }

        /**
         * Statrs the clock
         */
        public void start() {
            var listener = new TimePrinter();
            var timer = new Timer(interval, listener);
            timer.start();
        }

        public class TimePrinter implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is "
                        + Instant.ofEpochMilli(e.getWhen()));
                if (beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
    }
}
