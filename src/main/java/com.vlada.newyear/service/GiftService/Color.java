package com.vlada.newyear.service.GiftService;

public enum Color {
    RESET {
        public String getColor() {
            return (char) 27 + "[0m";
        }
    },
    RED {
        public String getColor() {
            return (char) 27 + "[31m";
        }
    },
    GREEN {
        public String getColor() {
            return (char) 27 + "[32m";
        }
    },
    BLUE {
        public String getColor() {
            return (char) 27 + "[34m";
        }
    },
    PURPLE {
        public String getColor() {
            return (char) 27 + "[35m";
        }
    },
    CYAN {
        public String getColor() {
            return (char) 27 + "[36m";
        }
    };

    public abstract String getColor();
}
