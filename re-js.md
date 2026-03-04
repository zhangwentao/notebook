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
    
    When a value is no longer reachable—when a program no longer has any way to refer to it—the interpreter knows it can never be used again and automatically reclaims the memory it was occupying. (JavaScript programmers do sometimes need to take care to ensure that values do not inadvertently remain reachable—and
therefore nonreclaimable—longer than necessary.
   









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


## statements

Expressions are evaluated to produce a value, but statements are executed to make something happen.

## object
