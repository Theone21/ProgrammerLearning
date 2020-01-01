public class Main {

    public static void main(String[] args) {
        String string = "asdf";
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        while (true){
            System.out.println(myThread.isFlag());
            if (myThread.isFlag()){
                System.out.println("值变为了" + myThread.isFlag());
                break;
            }
        }
    }
}

class MyThread implements Runnable{

    private boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        flag = true;
        System.out.println("flag的值为：" + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
