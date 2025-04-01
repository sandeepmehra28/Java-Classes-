package javaChallenges.StringClassesChalange.string.s;

class student {
    String name;
    int age;

    public student(int var1, String var2) {
        this.age = var1;
        this.name = var2;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder("challenge.string.Student{");
        var1.append("age=").append(this.age);
        var1.append(", name='").append(this.name).append('\'');
        var1.append('}');
        return var1.toString();
    }

    public static void main(String[] args) {
    }
}
