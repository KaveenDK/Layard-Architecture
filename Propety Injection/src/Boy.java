public class Boy {
    Agreement agreement = new Girl();

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.test();
        boy.test2();
    }

    public void test() {
        agreement.chat();
    }

    public void test2() {
        agreement.chat();
    }
}