package classwork.fiften15;

import java.util.Optional;

class Persons {
    public void setNickname(String nick) {
    }
    public static class Person {
        private int age;
        private String name;
        private String nickname;

        public Person (int age, String name){
            this.name = name;
            this.age = age;

        }
        public Optional<String> getOptionalNickname(){
            return Optional.ofNullable(nickname);
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
    }
}
