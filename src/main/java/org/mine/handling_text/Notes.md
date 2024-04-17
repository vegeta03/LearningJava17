# String and StringBuilder

## Mutability

- `String` operations that appear to change text must create a `new String`
  - Verify that an assignment has been made.
  - Simple invocation os `s.toUpperCase();` isn't useful without and an assignment for example like `s = s.toUpperCase()`
- Not all `StringBuilder` methods cause changes
  - For example, the methods which read elements of a StringBuilder do not mutate the StringBuilder.

## Comparing Text

- `String` overrides `equals(Object o)` and `hashCode()`
- `StringBuilder` does not override the `equals(Object o)` and `hashCode()`
- Most mutable data types in the core java API don't override `equals(Object o)` and `hashCode()` methods with one or two exceptions in the Collections API
- Both `String` and `StringBuilder` implement `Comparable` interface.
  - Comparisons are case sensitive by default.

## Common Text Methods

- `String` and `StringBuilder` implement `Comparable`
  - `compareTo(...)`
- Both implement `CharSequence`
  - `char charAt(int)`
  - `IntStream chars()` 
  - also `codePoints()`
    - CodePoints represent an extended character set that would go beyond what can be represented with the 16 bit UTF format that's used internally by Java.
  - `isEmpty()`
  - `length()`
  - `CharSequence subSequence(int, int)`
    - the subSequence method, allows us to define the beginning and the fence, that is one position beyond the end of a subSequence.
    - Notice that the interface `CharSequence` defines the return type simply as another `CharSequence`.
      - So if you have a `String` and you call `CharSequence subSequence(int, int)` method you will lose the `String` nature unless you test it and potentially do a downcast for it.

## More Common Text Methods
