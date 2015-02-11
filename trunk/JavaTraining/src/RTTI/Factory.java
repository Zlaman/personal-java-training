// Метод фабрика
package RTTI;

public interface Factory<T> {
    // позволяет возвращать разные типы для разных реализаций Factory
    T create();

}
