import math
import os
import random
import re
import sys


class Car:

    def __new__(cls, max_speed,unit):
        return "Car with the maximum speed of {0} {1}".format(max_speed, unit)

class Boat:

    def __new__(cls,max_speed):
        return "Boat with the maximum speed of {0} knots".format(max_speed)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    q = int(input())
    queries = []
    for _ in range(q):
        args = input().split()
        vehicle_type, params = args[0], args[1:]
        if vehicle_type == "car":
            max_speed, speed_unit = int(params[0]), params[1]
            vehicle = Car(max_speed, speed_unit)
        elif vehicle_type == "boat":
            max_speed = int(params[0])
            vehicle = Boat(max_speed)
        else:
            raise ValueError("invalid vehicle type")
        fptr.write("%s\n" % vehicle)
    fptr.close()
