package com.demoqa.exceptions;


public class ExceptionAlerts {



        public static void EsperaAlert (int seconds) {
            try {
                Thread.sleep(seconds * (long) 1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();

            }
        }

    }

