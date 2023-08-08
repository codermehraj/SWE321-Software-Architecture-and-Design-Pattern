package StructuralDesignPattern.adapter;

public interface IAdapter<T> {
    XML convert(T file);
}
