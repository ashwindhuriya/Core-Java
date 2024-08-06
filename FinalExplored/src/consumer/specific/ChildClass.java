package consumer.specific;

import dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {
    @Override
    protected void optionalMethod() {
        System.out.println("[Child:optionalMethod] Extra Stuff here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[Child:recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    public static void recommendedStatic() {
        System.out.println("[ChildClass.recommendedStatic]: Best way to do it");
        optionalStatic();
//        mandatoryStatic();
    }
}
