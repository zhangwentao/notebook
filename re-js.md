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

## optional semicolons
javascript use semicolon to separate statements from one another.







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
