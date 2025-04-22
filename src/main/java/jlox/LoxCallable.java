package jlox;

/**
 * @author: Robert Nystrom
 * @see: https://craftinginterpreters.com/
 */

import java.util.List;

interface LoxCallable {
    int arity();

    Object call(Interpreter interpreter, List<Object> arguments);
}
