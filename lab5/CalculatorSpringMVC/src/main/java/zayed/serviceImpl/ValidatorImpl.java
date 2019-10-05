package zayed.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import zayed.domain.Calculator;
import zayed.service.Validator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorImpl implements Validator {


    @Override
    public List<String> validate(Object object) {
        List<String> errors = new ArrayList<String>();
        Calculator calculator = (Calculator) object;

        if (calculator.getAdd1() != null && calculator.getAdd2() != null) {

        } else {
            errors.add("Input value of addition can't be null");
        }
        if (calculator.getMult1() != null && calculator.getMult1() != null) {

        } else {
            errors.add("Input value of multiplication can't be null");
        }
        return errors;
    }
}
