package com.dalouche.experiments.shapevisitor.shapes;

public interface ShapeVisitor {
	<T> T visitCircle(Circle circle);
	<T> T visitTriangle(Triangle circle);
	<T> T visitRectangle(Rectangle circle);
}