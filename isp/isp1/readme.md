## LSP - Liskov Substitutions Principle 

**Phrase of principle:**

*"Subtype Requirement: Let ϕ ( x ) {displaystyle phi (x)} phi (x) be a property provable about objects x {displaystyle x} x of type T. Then ϕ ( y ) {displaystyle phi (y)} {displaystyle phi (y)} should be true for objects y {displaystyle y} y of type S where S is a subtype of T. "*

**Short**

In short, a Sub-type can not override actions and properties of the base class, following this principle can use base class in method with Sub-type implemented without need of code change.

**Bad**

In bad example, is used the famous *"square is a rectangle"*, The class `Square` override methods of base class, So when we use the two classes(Rectangle, Square) in a single routine strange things happen. 

**Good**

In good example, is used composition, was created an `Interface` with method `result`.