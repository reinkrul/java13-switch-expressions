public class Java13SwitchExpressions {

    public void plainOldJava() {
        int i = (int)(Math.random() * 2);
        String s;
        switch(i) {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
            default:
                s = "other";
        }
        System.out.println(s);
    }

    public void switchExpression() {
        int i = (int)(Math.random() * 2);
        String s = switch (i) {
            case 1 -> "one";
            case 2 -> "two";
            default -> "other";
        };
        System.out.println(s);
    }
}
