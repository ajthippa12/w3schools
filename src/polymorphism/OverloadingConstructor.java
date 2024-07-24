package polymorphism;

public class OverloadingConstructor {
	double width, height, depth;

	OverloadingConstructor() // 1
	{
		width = height = depth = 0;

	}

	OverloadingConstructor(double w, double h, double d) // 2
	{
		width = w;
		height = h;
		depth = d;
	}

	OverloadingConstructor(double len) // 3
	{
		width = height = depth = len;
	}

	double volume() {
		return (width * height * depth);
	}
}