package def.es6_promise;
public class Promise<T> extends Thenable<T> {
    /**
	 * If you call resolve in the body of the callback passed to the constructor,
	 * your promise is fulfilled with result object passed to resolve.
	 * If you call reject your promise is rejected with the object passed to reject.
	 * For consistency and debugging (eg stack traces), obj should be an instanceof Error.
	 * Any errors thrown in the constructor callback will be implicitly passed to reject().
	 */
    public Promise(CallbackBiConsumer<java.util.function.Consumer<T>,java.util.function.Consumer<Object>> callback){}
    /**
	 * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
	 * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
	 * Both callbacks have a single parameter , the fulfillment value or rejection reason.
	 * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
	 * If an error is thrown in the callback, the returned promise rejects with that error.
	 *
	 * @param onFulfilled called when/if "promise" resolves
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("then")
    native public <U> Promise<U> thenOnFulfilledFunctionOnRejectedFunction(java.util.function.Function<T,U> onFulfilled, java.util.function.Function<Object,U> onRejected);
    @jsweet.lang.Name("then")
    native public <U> Promise<U> thenOnFulfilledFunction(java.util.function.Function<T,U> onFulfilled, java.util.function.Consumer<Object> onRejected);
    /**
	 * Sugar for promise.then(undefined, onRejected)
	 *
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("catch")
    native public <U> Promise<U> catchOnRejectedFunction(java.util.function.Function<Object,U> onRejected);
    /**
	 * Make a new promise from the thenable.
	 * A thenable is promise-like in as far as it has a "then" method.
	 */
    native public static <T> Promise<T> resolve(T value);
    /**
	 * Make a promise that rejects to obj. For consistency and debugging (eg stack traces), obj should be an instanceof Error
	 */
    native public static Promise<?> reject(ErrorAny error);
    native public static <T> Promise<T> reject(ErrorT<T> error);
    /**
	 * Make a promise that fulfills when every item in the array fulfills, and rejects if (and when) any item rejects.
	 * the array passed to all can be a mixture of promise-like objects and other objects.
	 * The fulfillment value is an array (in order) of fulfillment values. The rejection value is the first rejection value.
	 */
    native public static <T1,T2,T3,T4,T5,T6> Promise<jsweet.util.tuple.Tuple6<T1,T2,T3,T4,T5,T6>> all(jsweet.util.tuple.Tuple6<jsweet.util.union.Union<T1,Thenable<T1>>,jsweet.util.union.Union<T2,Thenable<T2>>,jsweet.util.union.Union<T3,Thenable<T3>>,jsweet.util.union.Union<T4,Thenable<T4>>,jsweet.util.union.Union<T5,Thenable<T5>>,jsweet.util.union.Union<T6,Thenable<T6>>> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1T2T3T4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4T1T2T3T4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3> Promise<jsweet.util.tuple.Tuple3<T1,T2,T3>> all(Tuple3T1T2T3<T1,T2,T3> values);
    native public static <T1,T2> Promise<jsweet.util.tuple.Tuple2<T1,T2>> all(Tuple2T1T2<T1,T2> values);
    native public static <T> Promise<T[]> all(T[] values);
    /**
	 * Make a Promise that fulfills when any item fulfills, and rejects if any item rejects.
	 */
    native public static <T> Promise<T> race(T[] promises);
    /**
	 * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
	 * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
	 * Both callbacks have a single parameter , the fulfillment value or rejection reason.
	 * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
	 * If an error is thrown in the callback, the returned promise rejects with that error.
	 *
	 * @param onFulfilled called when/if "promise" resolves
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("then")
    native public <U> Promise<U> thenOnFulfilledFunction(java.util.function.Function<T,U> onFulfilled);
    /**
	 * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
	 * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
	 * Both callbacks have a single parameter , the fulfillment value or rejection reason.
	 * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
	 * If an error is thrown in the callback, the returned promise rejects with that error.
	 *
	 * @param onFulfilled called when/if "promise" resolves
	 * @param onRejected called when/if "promise" rejects
	 */
    native public <U> Promise<U> then();
    /**
	 * Sugar for promise.then(undefined, onRejected)
	 *
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("catch")
    native public <U> Promise<U> Catch();
    /**
	 * Make a new promise from the thenable.
	 * A thenable is promise-like in as far as it has a "then" method.
	 */
    native public static <T> Promise<T> resolve();
    /**
	 * If you call resolve in the body of the callback passed to the constructor,
	 * your promise is fulfilled with result object passed to resolve.
	 * If you call reject your promise is rejected with the object passed to reject.
	 * For consistency and debugging (eg stack traces), obj should be an instanceof Error.
	 * Any errors thrown in the constructor callback will be implicitly passed to reject().
	 */
    public Promise(CallbackThenableBiConsumer<java.util.function.Consumer<Thenable<T>>,java.util.function.Consumer<Object>> callback){}
    /**
	 * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
	 * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
	 * Both callbacks have a single parameter , the fulfillment value or rejection reason.
	 * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
	 * If an error is thrown in the callback, the returned promise rejects with that error.
	 *
	 * @param onFulfilled called when/if "promise" resolves
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("then")
    native public <U> Promise<U> thenOnFulfilledThenableFunctionOnRejectedFunction(java.util.function.Function<T,Thenable<U>> onFulfilled, java.util.function.Function<Object,U> onRejected);
    /**
	 * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
	 * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
	 * Both callbacks have a single parameter , the fulfillment value or rejection reason.
	 * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
	 * If an error is thrown in the callback, the returned promise rejects with that error.
	 *
	 * @param onFulfilled called when/if "promise" resolves
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("then")
    native public <U> Promise<U> thenOnFulfilledThenableFunctionOnRejectedThenableFunction(java.util.function.Function<T,Thenable<U>> onFulfilled, java.util.function.Function<Object,Thenable<U>> onRejected);
    /**
	 * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
	 * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
	 * Both callbacks have a single parameter , the fulfillment value or rejection reason.
	 * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
	 * If an error is thrown in the callback, the returned promise rejects with that error.
	 *
	 * @param onFulfilled called when/if "promise" resolves
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("then")
    native public <U> Promise<U> thenOnFulfilledFunctionOnRejectedThenableFunction(java.util.function.Function<T,U> onFulfilled, java.util.function.Function<Object,Thenable<U>> onRejected);
    @jsweet.lang.Name("then")
    native public <U> Promise<U> thenOnFulfilledThenableFunction(java.util.function.Function<T,Thenable<U>> onFulfilled, java.util.function.Consumer<Object> onRejected);
    /**
	 * Sugar for promise.then(undefined, onRejected)
	 *
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("catch")
    native public <U> Promise<U> catchOnRejectedThenableFunction(java.util.function.Function<Object,Thenable<U>> onRejected);
    /**
	 * Make a new promise from the thenable.
	 * A thenable is promise-like in as far as it has a "then" method.
	 */
    native public static <T> Promise<T> resolve(Thenable<T> value);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Values29<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1ThenableT2T3T4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1T2T3ThenableT4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Values28<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Values30<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1ThenableT2T3T4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Values31<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1T2ThenableT3ThenableT4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1ThenableT2ThenableT3T4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1T2T3T4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Values26<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Values27<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1T2T3ThenableT4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1T2ThenableT3ThenableT4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1ThenableT2T3T4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1ThenableT2ThenableT3ThenableT4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1ThenableT2T3T4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1T2T3T4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1ThenableT2T3ThenableT4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1T2T3ThenableT4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1ThenableT2T3ThenableT4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1T2ThenableT3T4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1ThenableT2ThenableT3T4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1ThenableT2ThenableT3T4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1T2ThenableT3T4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5T1T2ThenableT3T4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1T2T3T4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1T2ThenableT3ThenableT4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1T2T3ThenableT4ThenableT5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1ThenableT2T3ThenableT4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4,T5> Promise<jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5>> all(Tuple5ThenableT1T2ThenableT3T4T5<T1,T2,T3,T4,T5> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4ThenableT1ThenableT2T3ThenableT4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4T1ThenableT2ThenableT3T4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4ThenableT1T2T3T4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4T1T2ThenableT3T4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4T1ThenableT2T3ThenableT4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4ThenableT1T2ThenableT3T4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4T1ThenableT2ThenableT3ThenableT4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4T1ThenableT2T3T4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4T1T2T3ThenableT4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Values15<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4T1T2ThenableT3ThenableT4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4ThenableT1ThenableT2T3T4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4ThenableT1T2T3ThenableT4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4ThenableT1ThenableT2ThenableT3T4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3,T4> Promise<jsweet.util.tuple.Tuple4<T1,T2,T3,T4>> all(Tuple4ThenableT1T2ThenableT3ThenableT4<T1,T2,T3,T4> values);
    native public static <T1,T2,T3> Promise<jsweet.util.tuple.Tuple3<T1,T2,T3>> all(Tuple3T1ThenableT2ThenableT3<T1,T2,T3> values);
    native public static <T1,T2,T3> Promise<jsweet.util.tuple.Tuple3<T1,T2,T3>> all(Tuple3ThenableT1ThenableT2ThenableT3<T1,T2,T3> values);
    native public static <T1,T2,T3> Promise<jsweet.util.tuple.Tuple3<T1,T2,T3>> all(Tuple3T1T2ThenableT3<T1,T2,T3> values);
    native public static <T1,T2,T3> Promise<jsweet.util.tuple.Tuple3<T1,T2,T3>> all(Tuple3T1ThenableT2T3<T1,T2,T3> values);
    native public static <T1,T2,T3> Promise<jsweet.util.tuple.Tuple3<T1,T2,T3>> all(Tuple3ThenableT1T2ThenableT3<T1,T2,T3> values);
    native public static <T1,T2,T3> Promise<jsweet.util.tuple.Tuple3<T1,T2,T3>> all(Tuple3ThenableT1ThenableT2T3<T1,T2,T3> values);
    native public static <T1,T2,T3> Promise<jsweet.util.tuple.Tuple3<T1,T2,T3>> all(Tuple3ThenableT1T2T3<T1,T2,T3> values);
    native public static <T1,T2> Promise<jsweet.util.tuple.Tuple2<T1,T2>> all(Tuple2T1ThenableT2<T1,T2> values);
    native public static <T1,T2> Promise<jsweet.util.tuple.Tuple2<T1,T2>> all(Tuple2ThenableT1T2<T1,T2> values);
    native public static <T1,T2> Promise<jsweet.util.tuple.Tuple2<T1,T2>> all(Tuple2ThenableT1ThenableT2<T1,T2> values);
    native public static <T> Promise<T[]> all(Thenable<T>[] values);
    /**
	 * Make a Promise that fulfills when any item fulfills, and rejects if any item rejects.
	 */
    native public static <T> Promise<T> race(Thenable<T>[] promises);
    /**
	 * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
	 * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
	 * Both callbacks have a single parameter , the fulfillment value or rejection reason.
	 * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
	 * If an error is thrown in the callback, the returned promise rejects with that error.
	 *
	 * @param onFulfilled called when/if "promise" resolves
	 * @param onRejected called when/if "promise" rejects
	 */
    @jsweet.lang.Name("then")
    native public <U> Promise<U> thenOnFulfilledThenableFunction(java.util.function.Function<T,Thenable<U>> onFulfilled);
    protected Promise(){}
    /** This functional interface should be used for disambiguating lambdas in function parameters (by casting to this interface).<p>It was automatically generated for functions (taking lambdas) that lead to the same erased signature. */
    @java.lang.FunctionalInterface()
    @jsweet.lang.Erased
    public interface CallbackThenableBiConsumer<T1,T2> {
        public void $apply(T1 p1, T2 p2);
    }
    /** This functional interface should be used for disambiguating lambdas in function parameters (by casting to this interface).<p>It was automatically generated for functions (taking lambdas) that lead to the same erased signature. */
    @java.lang.FunctionalInterface()
    @jsweet.lang.Erased
    public interface CallbackBiConsumer<T1,T2> {
        public void $apply(T1 p1, T2 p2);
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ErrorT<T> extends def.js.Object {
        public ErrorT(T error){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class ErrorAny extends def.js.Object {
        public ErrorAny(Object error){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1T2T3T4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1T2T3T4ThenableT5(jsweet.util.tuple.Tuple5<T1,T2,T3,T4,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1ThenableT2ThenableT3T4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1ThenableT2ThenableT3T4T5(jsweet.util.tuple.Tuple5<T1,Thenable<T2>,Thenable<T3>,T4,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1ThenableT2T3ThenableT4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1ThenableT2T3ThenableT4ThenableT5(jsweet.util.tuple.Tuple5<T1,Thenable<T2>,T3,Thenable<T4>,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Values29<T1,T2,T3,T4,T5> extends def.js.Object {
        public Values29(jsweet.util.tuple.Tuple5<Thenable<T1>,Thenable<T2>,Thenable<T3>,T4,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Values31<T1,T2,T3,T4,T5> extends def.js.Object {
        public Values31(jsweet.util.tuple.Tuple5<Thenable<T1>,Thenable<T2>,Thenable<T3>,Thenable<T4>,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1ThenableT2T3T4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1ThenableT2T3T4T5(jsweet.util.tuple.Tuple5<T1,Thenable<T2>,T3,T4,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1T2ThenableT3T4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1T2ThenableT3T4ThenableT5(jsweet.util.tuple.Tuple5<Thenable<T1>,T2,Thenable<T3>,T4,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1T2T3T4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1T2T3T4T5(jsweet.util.tuple.Tuple5<T1,T2,T3,T4,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Values27<T1,T2,T3,T4,T5> extends def.js.Object {
        public Values27(jsweet.util.tuple.Tuple5<Thenable<T1>,T2,Thenable<T3>,Thenable<T4>,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Values28<T1,T2,T3,T4,T5> extends def.js.Object {
        public Values28(jsweet.util.tuple.Tuple5<Thenable<T1>,Thenable<T2>,T3,Thenable<T4>,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1T2ThenableT3ThenableT4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1T2ThenableT3ThenableT4T5(jsweet.util.tuple.Tuple5<T1,T2,Thenable<T3>,Thenable<T4>,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1T2ThenableT3T4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1T2ThenableT3T4ThenableT5(jsweet.util.tuple.Tuple5<T1,T2,Thenable<T3>,T4,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Values26<T1,T2,T3,T4,T5> extends def.js.Object {
        public Values26(jsweet.util.tuple.Tuple5<T1,Thenable<T2>,Thenable<T3>,Thenable<T4>,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1T2T3T4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1T2T3T4T5(jsweet.util.tuple.Tuple5<Thenable<T1>,T2,T3,T4,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1ThenableT2T3T4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1ThenableT2T3T4ThenableT5(jsweet.util.tuple.Tuple5<Thenable<T1>,Thenable<T2>,T3,T4,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1T2ThenableT3T4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1T2ThenableT3T4T5(jsweet.util.tuple.Tuple5<T1,T2,Thenable<T3>,T4,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1T2T3ThenableT4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1T2T3ThenableT4ThenableT5(jsweet.util.tuple.Tuple5<Thenable<T1>,T2,T3,Thenable<T4>,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1T2ThenableT3ThenableT4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1T2ThenableT3ThenableT4ThenableT5(jsweet.util.tuple.Tuple5<T1,T2,Thenable<T3>,Thenable<T4>,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1ThenableT2T3ThenableT4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1ThenableT2T3ThenableT4T5(jsweet.util.tuple.Tuple5<T1,Thenable<T2>,T3,Thenable<T4>,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1T2T3ThenableT4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1T2T3ThenableT4T5(jsweet.util.tuple.Tuple5<T1,T2,T3,Thenable<T4>,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1T2ThenableT3ThenableT4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1T2ThenableT3ThenableT4T5(jsweet.util.tuple.Tuple5<Thenable<T1>,T2,Thenable<T3>,Thenable<T4>,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Values30<T1,T2,T3,T4,T5> extends def.js.Object {
        public Values30(jsweet.util.tuple.Tuple5<Thenable<T1>,Thenable<T2>,Thenable<T3>,Thenable<T4>,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1T2T3ThenableT4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1T2T3ThenableT4T5(jsweet.util.tuple.Tuple5<Thenable<T1>,T2,T3,Thenable<T4>,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1ThenableT2ThenableT3T4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1ThenableT2ThenableT3T4T5(jsweet.util.tuple.Tuple5<Thenable<T1>,Thenable<T2>,Thenable<T3>,T4,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1ThenableT2T3T4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1ThenableT2T3T4T5(jsweet.util.tuple.Tuple5<Thenable<T1>,Thenable<T2>,T3,T4,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1ThenableT2T3T4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1ThenableT2T3T4ThenableT5(jsweet.util.tuple.Tuple5<T1,Thenable<T2>,T3,T4,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1T2T3T4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1T2T3T4ThenableT5(jsweet.util.tuple.Tuple5<Thenable<T1>,T2,T3,T4,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1ThenableT2T3ThenableT4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1ThenableT2T3ThenableT4T5(jsweet.util.tuple.Tuple5<Thenable<T1>,Thenable<T2>,T3,Thenable<T4>,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1T2T3ThenableT4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1T2T3ThenableT4ThenableT5(jsweet.util.tuple.Tuple5<T1,T2,T3,Thenable<T4>,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1ThenableT2ThenableT3ThenableT4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1ThenableT2ThenableT3ThenableT4T5(jsweet.util.tuple.Tuple5<T1,Thenable<T2>,Thenable<T3>,Thenable<T4>,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5ThenableT1T2ThenableT3T4T5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5ThenableT1T2ThenableT3T4T5(jsweet.util.tuple.Tuple5<Thenable<T1>,T2,Thenable<T3>,T4,T5> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple5T1ThenableT2ThenableT3T4ThenableT5<T1,T2,T3,T4,T5> extends def.js.Object {
        public Tuple5T1ThenableT2ThenableT3T4ThenableT5(jsweet.util.tuple.Tuple5<T1,Thenable<T2>,Thenable<T3>,T4,Thenable<T5>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4T1ThenableT2T3ThenableT4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4T1ThenableT2T3ThenableT4(jsweet.util.tuple.Tuple4<T1,Thenable<T2>,T3,Thenable<T4>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4T1ThenableT2ThenableT3ThenableT4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4T1ThenableT2ThenableT3ThenableT4(jsweet.util.tuple.Tuple4<T1,Thenable<T2>,Thenable<T3>,Thenable<T4>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4T1ThenableT2T3T4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4T1ThenableT2T3T4(jsweet.util.tuple.Tuple4<T1,Thenable<T2>,T3,T4> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4T1T2T3T4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4T1T2T3T4(jsweet.util.tuple.Tuple4<T1,T2,T3,T4> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4ThenableT1T2T3ThenableT4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4ThenableT1T2T3ThenableT4(jsweet.util.tuple.Tuple4<Thenable<T1>,T2,T3,Thenable<T4>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4ThenableT1ThenableT2ThenableT3T4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4ThenableT1ThenableT2ThenableT3T4(jsweet.util.tuple.Tuple4<Thenable<T1>,Thenable<T2>,Thenable<T3>,T4> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4ThenableT1ThenableT2T3T4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4ThenableT1ThenableT2T3T4(jsweet.util.tuple.Tuple4<Thenable<T1>,Thenable<T2>,T3,T4> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4ThenableT1T2T3T4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4ThenableT1T2T3T4(jsweet.util.tuple.Tuple4<Thenable<T1>,T2,T3,T4> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4ThenableT1T2ThenableT3T4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4ThenableT1T2ThenableT3T4(jsweet.util.tuple.Tuple4<Thenable<T1>,T2,Thenable<T3>,T4> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4T1T2T3ThenableT4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4T1T2T3ThenableT4(jsweet.util.tuple.Tuple4<T1,T2,T3,Thenable<T4>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4ThenableT1ThenableT2T3ThenableT4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4ThenableT1ThenableT2T3ThenableT4(jsweet.util.tuple.Tuple4<Thenable<T1>,Thenable<T2>,T3,Thenable<T4>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4ThenableT1T2ThenableT3ThenableT4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4ThenableT1T2ThenableT3ThenableT4(jsweet.util.tuple.Tuple4<Thenable<T1>,T2,Thenable<T3>,Thenable<T4>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4T1T2ThenableT3T4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4T1T2ThenableT3T4(jsweet.util.tuple.Tuple4<T1,T2,Thenable<T3>,T4> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Values15<T1,T2,T3,T4> extends def.js.Object {
        public Values15(jsweet.util.tuple.Tuple4<Thenable<T1>,Thenable<T2>,Thenable<T3>,Thenable<T4>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4T1T2ThenableT3ThenableT4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4T1T2ThenableT3ThenableT4(jsweet.util.tuple.Tuple4<T1,T2,Thenable<T3>,Thenable<T4>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple4T1ThenableT2ThenableT3T4<T1,T2,T3,T4> extends def.js.Object {
        public Tuple4T1ThenableT2ThenableT3T4(jsweet.util.tuple.Tuple4<T1,Thenable<T2>,Thenable<T3>,T4> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple3T1ThenableT2ThenableT3<T1,T2,T3> extends def.js.Object {
        public Tuple3T1ThenableT2ThenableT3(jsweet.util.tuple.Tuple3<T1,Thenable<T2>,Thenable<T3>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple3T1ThenableT2T3<T1,T2,T3> extends def.js.Object {
        public Tuple3T1ThenableT2T3(jsweet.util.tuple.Tuple3<T1,Thenable<T2>,T3> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple3T1T2ThenableT3<T1,T2,T3> extends def.js.Object {
        public Tuple3T1T2ThenableT3(jsweet.util.tuple.Tuple3<T1,T2,Thenable<T3>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple3ThenableT1ThenableT2T3<T1,T2,T3> extends def.js.Object {
        public Tuple3ThenableT1ThenableT2T3(jsweet.util.tuple.Tuple3<Thenable<T1>,Thenable<T2>,T3> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple3ThenableT1T2ThenableT3<T1,T2,T3> extends def.js.Object {
        public Tuple3ThenableT1T2ThenableT3(jsweet.util.tuple.Tuple3<Thenable<T1>,T2,Thenable<T3>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple3T1T2T3<T1,T2,T3> extends def.js.Object {
        public Tuple3T1T2T3(jsweet.util.tuple.Tuple3<T1,T2,T3> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple3ThenableT1ThenableT2ThenableT3<T1,T2,T3> extends def.js.Object {
        public Tuple3ThenableT1ThenableT2ThenableT3(jsweet.util.tuple.Tuple3<Thenable<T1>,Thenable<T2>,Thenable<T3>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple3ThenableT1T2T3<T1,T2,T3> extends def.js.Object {
        public Tuple3ThenableT1T2T3(jsweet.util.tuple.Tuple3<Thenable<T1>,T2,T3> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple2T1ThenableT2<T1,T2> extends def.js.Object {
        public Tuple2T1ThenableT2(jsweet.util.tuple.Tuple2<T1,Thenable<T2>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple2ThenableT1ThenableT2<T1,T2> extends def.js.Object {
        public Tuple2ThenableT1ThenableT2(jsweet.util.tuple.Tuple2<Thenable<T1>,Thenable<T2>> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple2ThenableT1T2<T1,T2> extends def.js.Object {
        public Tuple2ThenableT1T2(jsweet.util.tuple.Tuple2<Thenable<T1>,T2> values){}
    }
    /** This class was automatically generated for disambiguating erased method signatures. */
    @jsweet.lang.Erased
    public static class Tuple2T1T2<T1,T2> extends def.js.Object {
        public Tuple2T1T2(jsweet.util.tuple.Tuple2<T1,T2> values){}
    }
}

