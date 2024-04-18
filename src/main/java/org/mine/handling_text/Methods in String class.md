# Methods in `String` class

## Overview of Methods

### Ways to Initialize `String`s

- empty `String`
- from 
  - `byte` arrays 
  - `char` arrays
  - arrays of code points, which are integers
  - `StringBuffer`s
  - `StringBuilder`s
  - `String` itself
- `String` cannot be initialized with a specific size, because the text can't be changed.

### Making new `String`s

- There are methods that create new `String`s to represent changes from what we have done before. Like: 
  - `concat` to concatenate strings
  - `copyValueOf` a `char` array
  - Can copy value of `char` arrays in a number of different ways:
    - including sub arrays
  - `format` method to create a complex `String` from a template and some arguments. There are different variations using different locale as well.
  - `join` `char` sequences with a variable length argument list of `char` sequences
  - also with an `Iterable` of `char` sequences.
  - `repeat` a string certain number of times.
  - `replace`[All/First] 
    - `replace` characters within `String`s or indeed replace character sequences within `String`s.
    - `replace` all of a certain `String` with another `String`
    - `replace` the first occurrence of a substring with a certain `String`.

### Mechanisms to extract values from a `String`

- `getBytes`
- `toCharArray`

### Comparisons

- `compareTo[IgnoreCase]`
- `contentEquals[IgnoreCase]`

### Tests

- `contains` something
- `endsWith` a certain piece of text
- `isEmpty`, whether it's blank or is empty (which are not quite the same thing)
- `matches` a particular regular expression.
- `regionMatches`, see if a region of the string matches a regular expression.
- `startWith` a certain piece of text.

### Case

- `toLowerCase`
- `toUpperCase`

### Cleanup

- `trim` to remove leading and trailing spaces
- `stripLeading` strip leading spaces
- `stripTrailing` strip trailing spaces  

One distinction between trim and strip methods are: 
- trim removes characters that are hexadecimal 20 i.e the space character, or lower values
- strip methods strip things which are defined as whitespace by Unicode conventions.