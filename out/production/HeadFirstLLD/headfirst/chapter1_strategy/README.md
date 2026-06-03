# Chapter 1: The Strategy Pattern (Duck Simulator)

## The Business Problem
We need to build a duck simulator game with a massive variety of ducks. Some fly, some quack, some squeak, and some are just wooden decoys.

## Architectural Evolution

### Attempt 1: The Inheritance Trap
* **Approach:** Put `fly()` and `quack()` in the `Duck` superclass and let all subclasses inherit them.
* **The Flaw:** Rubber ducks and wooden decoys suddenly started flying. Changing the parent class broke the children (violating the physical reality of the game).

### Attempt 2: The Interface Trap (Current State)
* **Approach:** Extract `fly()` and `quack()` into `Flyable` and `Quackable` interfaces. Only ducks that can actually fly will implement `Flyable`.
* **The Flaw:** This completely destroys code reusability. If I have 40 ducks that fly the exact same way, I have to copy-paste the exact same flight logic into 40 different classes. If the flight mechanics change, I have to update 40 files.