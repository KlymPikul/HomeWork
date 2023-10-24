package HomeWork_18;

public class Dog {
    private String name;
    private int jumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    public void train() {
        int maxJumpHeight = 2 * jumpHeight;
        if (jumpHeight < maxJumpHeight) {
            jumpHeight += 10;
            System.out.println(name + " тренируется. Новая высота прыжка: " + jumpHeight + " см.");
        } else {
            System.out.println(name + " достиг максимальной высоты тренировки.");
        }
    }

    public void jump(int barrierHeight) {
        if (jumpHeight >= barrierHeight) {
            System.out.println(name + " прыгнул через барьер высотой " + barrierHeight + " см.");
        } else {
            System.out.println(name + " не может преодолеть барьер высотой " + barrierHeight + " см.");
            int maxJumpHeight = 2 * jumpHeight;
            if (maxJumpHeight >= barrierHeight) {
                System.out.println(name + " может взять этот барьер после тренировки.");
                train();
                if (jumpHeight >= barrierHeight) {
                    System.out.println(name + " теперь может взять барьер.");
                }
            } else {
                System.out.println(name + " не может взять этот барьер даже после тренировки.");
            }
        }
    }
}
