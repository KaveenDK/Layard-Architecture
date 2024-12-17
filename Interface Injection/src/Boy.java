public class Boy implements DI{
    Agreement agreement;

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.inject(new Girl());
        boy.test();
        boy.test2();
    }

    public void test() {
        agreement.chat();
    }

    public void test2() {
        agreement.chat();
    }

    @Override
    public void inject(Agreement agreement) {
        this.agreement = agreement;
    }
}