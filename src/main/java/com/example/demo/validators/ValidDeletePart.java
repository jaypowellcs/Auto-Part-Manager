package com.example.demo.validators;

import javax.validation.Payload;

/**
 *
 *
 *
 *
 */
public @interface ValidDeletePart {
    String message() default "Part cannot be deleted if used in a product.";
}
