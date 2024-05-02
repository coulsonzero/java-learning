package Threader;


class loader implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

class ImpRunnabel {
    public static void main(String[] args) {
        Thread t = new Thread(new loader());
        t.start();
    }
}

