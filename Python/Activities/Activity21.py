'''
Docstring for tests.Activity21
Using pytest:

Create a new test file and write test to validate the following cases:

Sum of two numbers
Difference of two numbers
Product of two numbers
Quotient of two numbers
'''
import pytest
def test_sum():
    assert (5 + 3) == 8
def test_difference():
    assert (10 - 4) == 6
def test_product():
    assert (7 * 6) == 42
def test_quotient():
    assert (20 / 5) == 4

