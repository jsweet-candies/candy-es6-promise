/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
/**
 * If you call resolve in the body of the callback passed to the constructor,
 * your promise is fulfilled with result object passed to resolve.
 * If you call reject your promise is rejected with the object passed to reject.
 * For consistency and debugging (eg stack traces), obj should be an instanceof Error.
 * Any errors thrown in the constructor callback will be implicitly passed to reject().
 * @param {Promise.CallbackBiConsumer} callback
 * @class
 */
declare class Promise<T> implements Thenable<T> {
    public constructor(callback? : any);

    

    /**
     * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
     * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
     * Both callbacks have a single parameter , the fulfillment value or rejection reason.
     * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
     * If an error is thrown in the callback, the returned promise rejects with that error.
     * 
     * @param {java.util.function.Function} onFulfilled called when/if "promise" resolves
     * @param {java.util.function.Function} onRejected called when/if "promise" rejects
     * @return {Promise}
     */
    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    

    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    /**
     * Sugar for promise.then(undefined, onRejected)
     * 
     * @param {java.util.function.Function} onRejected called when/if "promise" rejects
     * @return {Promise}
     */
    public catch<U>(onRejected : (p1: any) => U) : Promise<U>;

    

    /**
     * Make a promise that rejects to obj. For consistency and debugging (eg stack traces), obj should be an instanceof Error
     * @param {Promise.ErrorAny} error
     * @return {Promise}
     */
    public static reject(error? : any) : any;

    

    /**
     * Make a promise that fulfills when every item in the array fulfills, and rejects if (and when) any item rejects.
     * the array passed to all can be a mixture of promise-like objects and other objects.
     * The fulfillment value is an array (in order) of fulfillment values. The rejection value is the first rejection value.
     * @param {Tuple6} values
     * @return {Promise}
     */
    public static all<T1, T2, T3, T4, T5, T6>(values? : any) : any;

    /**
     * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
     * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
     * Both callbacks have a single parameter , the fulfillment value or rejection reason.
     * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
     * If an error is thrown in the callback, the returned promise rejects with that error.
     * 
     * @param onFulfilled called when/if "promise" resolves
     * @param onRejected called when/if "promise" rejects
     * @return {Promise}
     */
    public then<U>() : Promise<U>;

    /**
     * Sugar for promise.then(undefined, onRejected)
     * 
     * @param onRejected called when/if "promise" rejects
     * @return {Promise}
     */
    public catch<U>() : Promise<U>;

    

    /**
     * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
     * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
     * Both callbacks have a single parameter , the fulfillment value or rejection reason.
     * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
     * If an error is thrown in the callback, the returned promise rejects with that error.
     * 
     * @param {java.util.function.Function} onFulfilled called when/if "promise" resolves
     * @param {java.util.function.Function} onRejected called when/if "promise" rejects
     * @return {Promise}
     */
    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    

    /**
     * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
     * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
     * Both callbacks have a single parameter , the fulfillment value or rejection reason.
     * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
     * If an error is thrown in the callback, the returned promise rejects with that error.
     * 
     * @param {java.util.function.Function} onFulfilled called when/if "promise" resolves
     * @param {java.util.function.Function} onRejected called when/if "promise" rejects
     * @return {Promise}
     */
    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    

    /**
     * onFulfilled is called when/if "promise" resolves. onRejected is called when/if "promise" rejects.
     * Both are optional, if either/both are omitted the next onFulfilled/onRejected in the chain is called.
     * Both callbacks have a single parameter , the fulfillment value or rejection reason.
     * "then" returns a new promise equivalent to the value you return from onFulfilled/onRejected after being passed through Promise.resolve.
     * If an error is thrown in the callback, the returned promise rejects with that error.
     * 
     * @param {java.util.function.Function} onFulfilled called when/if "promise" resolves
     * @param {java.util.function.Function} onRejected called when/if "promise" rejects
     * @return {Promise}
     */
    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    

    public then<U>(onFulfilled? : any, onRejected? : any) : any;

    /**
     * Sugar for promise.then(undefined, onRejected)
     * 
     * @param {java.util.function.Function} onRejected called when/if "promise" rejects
     * @return {Promise}
     */
    public catch<U>(onRejected : (p1: any) => Thenable<U>) : Promise<U>;

    

    /**
     * Make a new promise from the thenable.
     * A thenable is promise-like in as far as it has a "then" method.
     * @param {Thenable} value
     * @return {Promise}
     */
    public static resolve<T>(value? : any) : any;

    

    /**
     * Make a Promise that fulfills when any item fulfills, and rejects if any item rejects.
     * @param {Array} promises
     * @return {Promise}
     */
    public static race<T>(promises? : any) : any;
}

interface Thenable<T> {
    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>() : Thenable<U>;

    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>(onFulfilled? : any, onRejected? : any) : any;

    then<U>(onFulfilled? : any, onRejected? : any) : any;
}


