# Java Modifiers
## Class Modifiers (Top-level)
- public: can be extended in other packages, reachable out of package.
- "No modifier": if you didn't specify any modifier class will work like a package-private class.
- final: prohibiting class to be inherited.

### Visibility
| Modifier | Class | Package | Subclass | World |
| --- | --- | --- | --- | --- |
| public | Y | Y | Y | Y |
| no modifier | Y | Y | N | N |

Modifier **final** doesn't affect visibility.