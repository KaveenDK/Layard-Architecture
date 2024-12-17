public class Boy {
    Agreement agreement;

    public Boy(Agreement agreement) {
        this.agreement = agreement;
    }

    public static void main(String[] args) {
        Boy boy = new Boy(new Girl());
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