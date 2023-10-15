package Item4;

/**
 * Prefer dependency injection over hardwiring resources
 *
 * For eg :-
 * Class SpellChecker depends upon dictionary
 * Now dictionary can be of multiple languages. Not one dictionary can support a spellChecker
 * That implies not singleton of dictionary would work neither statically changing
 *
 * Static utility classes and singletons are inapt. for classes whose behaviour is parameterized by an
 * underlying resource
 *
 * DI -> Pass the resource into the constructor when creating a new instane
 */