package com.nest.security;

/**
 * @author botter
 */
@FunctionalInterface
public interface IFunctionInterface<T, R> {

    R test(T t);
}
