package def.es6_promise;
@jsweet.lang.Interface
public abstract class Thenable<T> extends def.js.Object {
    @jsweet.lang.Name("then")
    native public <U> Thenable<U> thenOnFulfilledFunctionOnRejectedFunction(java.util.function.Function<T,U> onFulfilled, java.util.function.Function<Object,U> onRejected);
    @jsweet.lang.Name("then")
    native public <U> Thenable<U> thenOnFulfilledFunction(java.util.function.Function<T,U> onFulfilled, java.util.function.Consumer<Object> onRejected);
    @jsweet.lang.Name("then")
    native public <U> Thenable<U> thenOnFulfilledFunction(java.util.function.Function<T,U> onFulfilled);
    native public <U> Thenable<U> then();
    @jsweet.lang.Name("then")
    native public <U> Thenable<U> thenOnFulfilledFunctionOnRejectedThenableFunction(java.util.function.Function<T,U> onFulfilled, java.util.function.Function<Object,Thenable<U>> onRejected);
    @jsweet.lang.Name("then")
    native public <U> Thenable<U> thenOnFulfilledThenableFunctionOnRejectedThenableFunction(java.util.function.Function<T,Thenable<U>> onFulfilled, java.util.function.Function<Object,Thenable<U>> onRejected);
    @jsweet.lang.Name("then")
    native public <U> Thenable<U> thenOnFulfilledThenableFunctionOnRejectedFunction(java.util.function.Function<T,Thenable<U>> onFulfilled, java.util.function.Function<Object,U> onRejected);
    @jsweet.lang.Name("then")
    native public <U> Thenable<U> thenOnFulfilledThenableFunction(java.util.function.Function<T,Thenable<U>> onFulfilled, java.util.function.Consumer<Object> onRejected);
    @jsweet.lang.Name("then")
    native public <U> Thenable<U> thenOnFulfilledThenableFunction(java.util.function.Function<T,Thenable<U>> onFulfilled);
}

