/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface Thenable<T> extends Object {
    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>() : Thenable<U>;

    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>(onFulfilled? : any, onRejected? : any) : any;
}

/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare class Promise<T> implements Thenable<T> {
    /**
     * If you call resolve in the body of the callback passed to the constructor,
     * your promise is fulfilled with result object passed to resolve.
     * If you call reject your promise is rejected with the object passed to reject.
     * For consistency and debugging (eg stack traces), obj should be an instanceof Error.
     * Any errors thrown in the constructor callback will be implicitly passed to reject().
     */
    public constructor(callback? : any);

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
    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    /**
     * Sugar for promise.then(undefined, onRejected)
     * 
     * @param onRejected called when/if "promise" rejects
     */
    public catch<U>(onRejected : (p1: any) => U) : Promise<U>;

    /**
     * Make a new promise from the thenable.
     * A thenable is promise-like in as far as it has a "then" method.
     */
    public static resolve$java_lang_Object<T>(value : T) : Promise<T>;

    /**
     * Make a promise that rejects to obj. For consistency and debugging (eg stack traces), obj should be an instanceof Error
     */
    public static reject(error? : any) : any;

    public static reject$def_es6_promise_Promise_ErrorT<T>(error : any) : Promise<T>;

    /**
     * Make a promise that fulfills when every item in the array fulfills, and rejects if (and when) any item rejects.
     * the array passed to all can be a mixture of promise-like objects and other objects.
     * The fulfillment value is an array (in order) of fulfillment values. The rejection value is the first rejection value.
     */
    public static all<T1, T2, T3, T4, T5, T6>(values? : any) : any;

    public static all$def_es6_promise_Promise_Tuple5T1T2T3T4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple4T1T2T3T4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple3T1T2T3<T1, T2, T3>(values : any) : Promise<[T1,T2,T3]>;

    public static all$def_es6_promise_Promise_Tuple2T1T2<T1, T2>(values : any) : Promise<[T1,T2]>;

    public static all$java_lang_Object_A<T>(values : T[]) : Promise<T[]>;

    /**
     * Make a Promise that fulfills when any item fulfills, and rejects if any item rejects.
     */
    public static race$java_lang_Object_A<T>(promises : T[]) : Promise<T>;

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
    public thenOnFulfilledFunction$java_util_function_Function<U>(onFulfilled : (p1: T) => U) : Promise<U>;

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
    public then<U>() : Promise<U>;

    /**
     * Sugar for promise.then(undefined, onRejected)
     * 
     * @param onRejected called when/if "promise" rejects
     */
    public catch<U>() : Promise<U>;

    /**
     * Make a new promise from the thenable.
     * A thenable is promise-like in as far as it has a "then" method.
     */
    public static resolve$<T>() : Promise<T>;

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
    public then<U>(onFulfilled? : any, onRejected? : any) : any;

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
    public then<U>(onFulfilled? : any, onRejected? : any) : any;

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
    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    /**
     * Sugar for promise.then(undefined, onRejected)
     * 
     * @param onRejected called when/if "promise" rejects
     */
    public catch<U>(onRejected : (p1: any) => Thenable<U>) : Promise<U>;

    /**
     * Make a new promise from the thenable.
     * A thenable is promise-like in as far as it has a "then" method.
     */
    public static resolve<T>(value? : any) : any;

    public static all$def_es6_promise_Promise_Values29<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1ThenableT2T3T4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1T2T3ThenableT4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Values28<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Values30<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1ThenableT2T3T4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Values31<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1T2ThenableT3ThenableT4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1ThenableT2ThenableT3T4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1T2T3T4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Values26<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Values27<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1T2T3ThenableT4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1T2ThenableT3ThenableT4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1ThenableT2T3T4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1ThenableT2ThenableT3ThenableT4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1ThenableT2T3T4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1T2T3T4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1ThenableT2T3ThenableT4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1T2T3ThenableT4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1ThenableT2T3ThenableT4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1T2ThenableT3T4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1ThenableT2ThenableT3T4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1ThenableT2ThenableT3T4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1T2ThenableT3T4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5T1T2ThenableT3T4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1T2T3T4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1T2ThenableT3ThenableT4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1T2T3ThenableT4ThenableT5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1ThenableT2T3ThenableT4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple5ThenableT1T2ThenableT3T4T5<T1, T2, T3, T4, T5>(values : any) : Promise<[T1,T2,T3,T4,T5]>;

    public static all$def_es6_promise_Promise_Tuple4ThenableT1ThenableT2T3ThenableT4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4T1ThenableT2ThenableT3T4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4ThenableT1T2T3T4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4T1T2ThenableT3T4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4T1ThenableT2T3ThenableT4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4ThenableT1T2ThenableT3T4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4T1ThenableT2ThenableT3ThenableT4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4T1ThenableT2T3T4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4T1T2T3ThenableT4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Values15<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4T1T2ThenableT3ThenableT4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4ThenableT1ThenableT2T3T4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4ThenableT1T2T3ThenableT4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4ThenableT1ThenableT2ThenableT3T4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple4ThenableT1T2ThenableT3ThenableT4<T1, T2, T3, T4>(values : any) : Promise<[T1,T2,T3,T4]>;

    public static all$def_es6_promise_Promise_Tuple3T1ThenableT2ThenableT3<T1, T2, T3>(values : any) : Promise<[T1,T2,T3]>;

    public static all$def_es6_promise_Promise_Tuple3ThenableT1ThenableT2ThenableT3<T1, T2, T3>(values : any) : Promise<[T1,T2,T3]>;

    public static all$def_es6_promise_Promise_Tuple3T1T2ThenableT3<T1, T2, T3>(values : any) : Promise<[T1,T2,T3]>;

    public static all$def_es6_promise_Promise_Tuple3T1ThenableT2T3<T1, T2, T3>(values : any) : Promise<[T1,T2,T3]>;

    public static all$def_es6_promise_Promise_Tuple3ThenableT1T2ThenableT3<T1, T2, T3>(values : any) : Promise<[T1,T2,T3]>;

    public static all$def_es6_promise_Promise_Tuple3ThenableT1ThenableT2T3<T1, T2, T3>(values : any) : Promise<[T1,T2,T3]>;

    public static all$def_es6_promise_Promise_Tuple3ThenableT1T2T3<T1, T2, T3>(values : any) : Promise<[T1,T2,T3]>;

    public static all$def_es6_promise_Promise_Tuple2T1ThenableT2<T1, T2>(values : any) : Promise<[T1,T2]>;

    public static all$def_es6_promise_Promise_Tuple2ThenableT1T2<T1, T2>(values : any) : Promise<[T1,T2]>;

    public static all$def_es6_promise_Promise_Tuple2ThenableT1ThenableT2<T1, T2>(values : any) : Promise<[T1,T2]>;

    public static all$def_es6_promise_Thenable_A<T>(values : Thenable<T>[]) : Promise<T[]>;

    /**
     * Make a Promise that fulfills when any item fulfills, and rejects if any item rejects.
     */
    public static race<T>(promises? : any) : any;

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
    public thenOnFulfilledThenableFunction$java_util_function_Function<U>(onFulfilled : (p1: T) => Thenable<U>) : Promise<U>;
}


