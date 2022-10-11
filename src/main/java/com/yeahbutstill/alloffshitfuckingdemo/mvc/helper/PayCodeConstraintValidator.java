package com.yeahbutstill.alloffshitfuckingdemo.mvc.helper;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PayCodeConstraintValidator  implements ConstraintValidator<PayCode, String> {

    private String[] payCodePrefix;

    @Override
    public void initialize(PayCode thePayCode) {
        payCodePrefix = thePayCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

        boolean result = false;

        if (theCode != null) {
            // loop true pay prefixes
            // check to see if code matches any of the pay prefixes
            for (String tempPrefix : payCodePrefix) {
                result = theCode.startsWith(tempPrefix);

                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
            }

        } else {
            return true;
        }

        return result;
    }
}
