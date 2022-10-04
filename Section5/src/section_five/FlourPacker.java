package section_five;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (goal < 0 || bigCount < 0 || smallCount < 0) {
            return false;
        }
        return (bigCount * 5 + smallCount >= goal) && (goal % 5 <= smallCount);
    }

    public static boolean canPackAltOne(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        while (bigCount > 0 && goal >= 5) {
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal;
    }

    public static boolean canPackAltTwo(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigBags = Math.min(bigCount, goal / 5);

        return (goal - (bigBags * 5)) <= smallCount;
    }

    public static boolean canPackNestedLoop(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = 0; i < bigCount; i++) {
            for (int j = 0; j < smallCount; j++) {
                if (goal == (i * 5) + j) {
                    return true;
                }
            }
        }
        return false;
    }
}






