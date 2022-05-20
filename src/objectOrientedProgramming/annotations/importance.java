package objectOrientedProgramming.annotations;

import java.lang.annotation.Documented;

@Documented
public @interface importance {
    /**
     * <p>Signify the order in which parts of code should be created, updated, etc.</p>
     * <p>A priority of 1 means it is the most important</p>
     * @return priority
     **/
    int value();
}
