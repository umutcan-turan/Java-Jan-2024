package org.csystem.generator.random.point;

import org.csystem.math.geometry.Point;

import java.util.ArrayList;
import java.util.Random;

public class RandomPointGenerator {
    private final Random m_random;
    private final double m_origin, m_bound;

    private Point createRandomPoint()
    {
        return Point.createCartesian(m_random.nextDouble(m_origin, m_bound), m_random.nextDouble(m_origin, m_bound));
    }

    public RandomPointGenerator(Random random, double origin, double bound)
    {
        m_random = random;
        m_origin = origin;
        m_bound = bound;
    }


    public void addPoints(ArrayList points, int count)
    {
        for (int i = 0; i < count; i++)
            points.add(createRandomPoint());
    }

    public Point[] createPointArray(int count)
    {
        Point [] points = new Point[count];

        for (int i = 0; i < count; i++)
            points[i] = createRandomPoint();

        return points;
    }

}
