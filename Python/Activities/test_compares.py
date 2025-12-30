import pytest

@pytest.mark.great
def test_greater_than():
    assert 5 > 2    
@pytest.mark.great
def test_greater_equal():
    assert 3 >= 3
@pytest.mark.other
def test_less_than():
    assert 2 < 5
    