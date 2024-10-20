package com.example.entitylist;

public class Entity {

        private int type;
        private String name;
        private String textType;

        public Entity(int type, String name, String textType) {
            this.type = type;
            this.name = name;
            this.textType = textType;
        }

        public int getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public String getTextType() {
            return textType;
        }
    }


