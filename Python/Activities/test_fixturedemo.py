import pytest

def test_sum(sample_list):
    assert sum (sample_list) == 15

def test_write(resource):
    resource.write("Hello, World!")
      