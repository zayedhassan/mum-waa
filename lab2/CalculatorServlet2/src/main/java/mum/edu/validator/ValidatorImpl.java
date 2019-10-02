package mum.edu.validator;

import mum.edu.domain.Calculator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorImpl implements Validator {
    @Override
    public List<String> validate(Object object) {
        List<String> errors = new ArrayList<String>();
        Calculator calculator = (Calculator) object;
        Integer add1 = calculator.getAdd1();
        Integer add2 = calculator.getAdd2();
        Integer mult1 = calculator.getMult1();
        Integer mult2 = calculator.getMult2();
        if (add1 != null && add2 != null) {

        } else {
            errors.add("Input value of addition can't be null");
        }
        if (mult1 != null && mult2 != null) {

        } else {
            errors.add("Input value of multiplication can't be null");
        }
        return errors;
    }
}
