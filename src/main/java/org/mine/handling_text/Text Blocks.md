# Text Blocks

- Text blocks simplify multi-line literals
```java
String js = """
    let x = 10;   \
    console.log(x);""";
```
- Introduce and terminate with three double-quotes:
  - Opening triple-quote must be followed by newline
    - whitespace before the newline will be ignored
  - Closing triple-quote can be on the same line
    - if on a new line result will include a trailing newline
  - Embedded newlines become part of the result.  

- Text blocks are not "raw"; some processing is performed.
  - Common leading indentation is stripped
    - `String.indent(int indent)` adds spaces, removes whitespaces at the start of every line of any `String`
    - `indent` considers `\n`, `\r` or `\r\n` each as an end of line, they're replaced with `\n` in any case
- Trailing whitespace is stripped

- Embedded newlines are represented as character `0x0a`
- Escape sequences are processed are normal,
  - e.g., `\n`->`0x0a`, `\r`->`0x0d`
- Backslash, newline pair in source results in no newline embedded
- To embed a single backslash in the result, it must be escaped(i.e., use two backslashes together)

- Double quote marks in the literal are placed in the `String` if:
  - they are escaped, or 
  - there are fewer than three unescaped double quotes in sequence.