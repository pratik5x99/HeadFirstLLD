# Chapter 1: The Strategy Pattern (Duck Simulator)

## The Business Problem
We need to build a duck simulator game with a massive variety of ducks. Some fly, some quack, some squeak, and some are just wooden decoys. Requirements for new duck behaviors change constantly.

## Architectural Evolution

### Attempt 1: The Inheritance Trap
* **Approach:** Put `fly()` and `quack()` in the `Duck` superclass and let all subclasses inherit them.
* **The Flaw:** Rubber ducks and wooden decoys suddenly started flying. Changing the parent class unexpectedly broke the children.

### Attempt 2: The Interface Trap
* **Approach:** Extract `fly()` and `quack()` into `Flyable` and `Quackable` interfaces.
* **The Flaw:** Destroys code reuse. We are forced to copy-paste the exact same flight logic into every single duck class that implements the interface.

### Attempt 3: The Strategy Pattern (Composition)
* **Approach:** Treat behaviors like physical objects. Created `FlyBehaviour` and `QuackBehaviour` interfaces with concrete implementation classes (e.g., `FlyWithWings`). The `Duck` class holds these behaviors as instance variables and *delegates* the action to them.
* **The Result:** Perfect code reuse. We can change a duck's behavior without touching the Duck class itself.

### Attempt 4: Dynamic Behavior at Runtime (The Final Polish)
* **Approach:** Added setter methods (`changeFlyBehaviour()`) to the base `Duck` class.
* **The Result:** We can now change a duck's physical capabilities *while the program is running*. For example, instantiating a ModelDuck that cannot fly, and dynamically injecting a `FlyRocketPowered` behavior into it at runtime.

## Core Design Principles Learned
1. **Encapsulate what varies:** Identify the aspects of your application that change and separate them from what stays the same.
2. **Program to an interface, not an implementation:** Variables should be declared as supertypes/interfaces so the exact implementation can be dynamically swapped.
3. **Favor composition over inheritance:** Instead of inheriting behavior (IS-A), give the class the behavior as a tool it owns and delegates to (HAS-A).