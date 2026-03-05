## Lexical Structure

it is lowest-level syntax of a language, is the set of elementary rules that specifies how you write programs in that language.

+ case-senstive
+ ignore spaces that appear between tokens in program. (spaces is meanningless, free format code as you will).

### literals
A literal is a data value that appears directly in a program.

+ 

### identifier and reserved words

+ indentifier is simply a name.
+ name constants,variables,properties,functions,classes,label for cerain loops
+ must begin with a letter,an underscore,or dollar sign.

### reserved words
some words are part of JavaScript language that are reserved keywrods that must not be used as the names of constants,variables,functions,or classes(though they can all be used as the names of properties within an object).

### unicode

avaScript programs are written using the Unicode character set
+ can use any unicode character in strings and comments.
+ also can use be as identifier ,eg . variables, constants, functions ...

#### unicode escape

+ reason: some computer hardware and software cannot display,input,or correctly process the full set of unicode characters.
+ to support pre reason, js defines escape sequences that allow us to write unicode characters using only ASCII characters.
+ begin with characters \u and followed by exactly four hexadecimal digits, \uffff e.g
+ this escapes appear in string literals,regular expression literals, identifiers(but not in language keywords).
+ The version with curly braces was introduced in ES6 to better support Unicode codepoints that require more than 16 bits, such as emoji: \u{1F600}

#### Unicode Normalization
The string “é,” for example, can be encoded as the single Unicode character \u00E9 or as a regular ASCII “e” followed by the acute accent combining mark \u0301. 

#### optional semicolons
javascript use semicolon to separate statements from one another.
+ you can usually omit the semicolon between two statements if those statements are written on separate lines.
+ You can also omit a semicolon at the end of a program or if the next token in the program is a closing curly brace: }
+ Many JavaScript programmers (and the code in this book) use semicolons to explicitly mark the ends of statements, even where they are not required. Another style is to omit semicolons whenever possible, using them only in the few situations that require them.

## types, values, variables
+ The kinds of values that can be represented and manipulated in a programming language are known as types.
+ one of the most fundamental characteristics of a programming language is the set of types it supports.
+ When a program needs to retain a value for future use, it assigns the value to (or “stores” the value in) a variable. 
+ Variables have names, and they allow use of those names in our programs to refer to values. 
+ The way that variables work is another fundamental characteristic of any programming language. 

### types
#### two categories:
+ primitive types

  - numbers,strings,booleans,symbols(es6 added)
  - The special JavaScript values null and undefined are primitive values,Each value is typically considered to be the sole member of its own special type

+ object types
  
  - Any JavaScript value that is not a number, a string, a boolean, a symbol, null, or undefined is an object.
  - an ordinary Javascript object is an unordered collection of named values.
  - javascript also defines a special kind of object, known as an array.
  - In addition to basic objects and arrays, JavaScript defines a number of other useful object types.

    + Set object
    + Map object
    + RegExp 
    + Date 
    + Error

- *javaScript differs from more static languages in that functions and classes are not just part of the language syntax: they are themselves values that can be mannipulated by JavaScript program*. functions an classes are a specialized kind of object.
- **the javascript interpreter perform automatic garbage colleaction for memory management**
  
    When a value is no longer reachable—when a program no longer has any way to refer to it—the interpreter knows it can never be used again and automatically reclaims the memory it was occupying. (JavaScript programmers do sometimes need to take care to ensure that values do not inadvertently remain reachable—and therefore nonreclaimable—longer than necessary.

- In JavaScript, null and undefined are the only values that methods cannot be invoked on.
- object types are nutable and primitive types are immutable.

  - a value of a mutable type can change, can change the values of object properties an array elements.
  - numbers,strings,booleans,symbols,null,undefined are immutable. you can access the text at any index of a string, but JavaScript provides no way to alter the text of an existing string
- JavaScript liberally converts values from one type to another. If a program expects a string, for example, and you give it a number, it will automatically convert the number to a string for you.    

### Numbers
in JavaScript, type Number, is used to represent integers and approximate real numbers;

+ JavaScript represents numbers using the 64-bit floating-point format defined by the IEEE 754 standard.

### The Global Object
the global object is a regular JavaScript object.

+ the properties of this object are the globally defined indentifers that are available to a JavaScript program.
+ whenever the JavaScript interpreter starts(or whenever a web browser loads a new page).it creates a new global object and gives it an initial set of properties that define:
  
  - Global constants like undefined, Infinity, and NaN
  - Global functions like isNaN(), parseInt() (§3.9.2), and eval()
  - Constructor functions like Date(), RegExp(), String(), Object(), and Array() 
  - Global objects like Math and JSON

+ In Node, the global object has a property named global whose value is the global object itself, so you can always refer to the global object by the name global in Node programs.  + n web browsers, the Window object serves as the global object for all JavaScript code contained in the browser window it represents. This global Window object has a self-referential window property that can be used to refer to the global object. 
+ Web worker threads (§15.13) have a different global object than the Window with which they are associated. Code in a worker can refer to its global object as self.
+ ES2020 finally defines globalThis as the standard way to refer to the global object in any context. As of early 2020, this feature has been implemented by all modern browsers and by Node.

### Immutable primitives Value and Mutable object References
+ there is no way to change (or “mutate”) a primitive value. 
+ Primitives are also compared by value: two values are the same only if they have the same value.
+ If two distinct string values are compared, JavaScript treats them as equal if, and only if, they have the same length and if the character at each index is the same.
+ Objects are sometimes called reference types to distinguish them from JavaScript’s primitive types. Using this terminology, object values are references, and we say that objects are compared by reference: two object values are the same if and only if they refer to the same underlying object.









## var,let,const

+ globalThis (globalObjet)

  strict mode: 

+ unstrict mode:

  - assign value to a undeclare variable is adding a field to globalObject

+ function scope

+ block scope

  for,while,fo...in, for...of

## destructure assignment


## expression

An expression is a phrase of JavaScript that can be evaluated to produce a value.
+ complex expressions are built from simpler expresssions.
+ the most common way to build a complex expression out of simpler expression is with an operator.
+ an operator combines the values of its operands in some way and ealuates to a new value.

### primary expression
The simplest expressions, known as primary expressions, are those that stand alone—they do not include any simpler expressions.
Primary expressions in JavaScript are:
+ constant or literal values
+ certain language keywords
+ variable reference

When any identifier appears by itself in a program, JavaScript assumes it is a variable or constant or property of the global object and looks up its value. If no variable with that name exists, an attempt to evaluate a nonexistent variable throws a ReferenceError instead.

### Object and Array Initializers

### Function Definition Expressions
+ normal function definition
+ arrow function definition

### property access Expressions
A property access expression evaluates to the value of an object property or an array element. JavaScript defines two syntaxes for property access:

+ expression . identifier
+ expression [ expression ] 

#### conditional property access
+ expression ?. identifier
+ expression ?.[ expression ]

### invocation Expression

+ function expression is evaluated first,
+ hen the argument expressions are evaluated to produce a list of argument values
+ If the value of the function expression is not a function, a TypeError is thrown. 
+ If that expression is a property
+ access expression, then the invocation is known as a method invocation. In method invocations, the object or array that is the subject of the property access becomes the value of the this keyword while the body of the function is being executed. 
#### conditional invocation
+ With the new ?.() invocation syntax, if the expression to the left of the ?. evaluates to null or undefined, then the entire invocation expression evaluates to undefined and no exception is thrown.

### Object Creation Expressions
An object creation expression creates a new object and invokes a function (called a constructor) to initialize the properties of that object.  Object creation expressions are like invocation expressions except that they are prefixed with the keyword new
+ If no arguments are passed to the constructor function in an object creation expression, the empty pair of parentheses can be omitted


## Operator Overview

### Operator Side Effects
+ value assignment
+ function calling

### === and ==
+ === more strict 

### in
The in operator expects a left-side operand that is a string, symbol, or value that can be converted to a string. It expects a right-side operand that is an object. It evaluates to true if the left-side value is the name of a property of the right-side object.

### The instanceof Operator
The instanceof operator expects a left-side operand that is an object and a right-side operand that identifies a class of objects
+ Note that all objects are instances of Object
+ instanceof considers the “superclasses” when deciding whether an object is an instance of a class. If the left-side operand of instanceof is not an object, instanceof returns false. If the righthand side is not a class of objects, it throws a TypeError
+ To evaluate the expression o instanceof f, JavaScript evaluates f.prototype, and then looks for that value in the prototype chain of o. If it finds it, then o is an instance of f (or of a subclass of f) and the operator returns true.  If f.prototype is not one of the values in the prototype chain of o, then o is not an instance of f and instanceof returns false.

### Assignment Expressions
The = operator expects its left-side operand to be an lvalue: a variable or object property (or array element). It expects its right-side operand to be an arbitrary value of any type. The value of an assignment expression is the value of the right-side operand. As a side effect, the = operator assigns the value on the right to the variable or property on the left so that future references to the variable or property evaluate to the value.

### Evaluation Expressions

## statements

Expressions are evaluated to produce a value, but statements are executed to make something happen.

+ Expressions with side effects, such as assignments and function invocations, can stand alone as statements, and when used this way are known as expression statements.

+ JavaScript programs are nothing more than a sequence of statements to execute. By default, the JavaScript interpreter executes these statements one after another in the order they are written. Another way to “make something happen” is to alter this default order of execution, and JavaScript has a number of statements or control structures that do just this:

  - Conditionals
  - Loops
  - Jump

## object





## todo
+ number range logic
