package nestedClasses;

class Outer {
    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();
        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    //This is an inner class.
    class Inner {
        int min() {
            int min = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];

                }
            }
            return min;
        }

        int max() {
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        }

        int avg() {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum / nums.length;
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outOb = new Outer(x);
        outOb.analyze();
    }
}
