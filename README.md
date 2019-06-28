# Lab 04

## Due: Week 4, Sunday, 5:00 pm

## Value: 1 mark

## Aim

* Become familiar with design patterns - strategy and state

## Setup

An individual repository for this lab has been created for you here (replace z5555555 with your own zID):

https://gitlab.cse.unsw.edu.au/z5555555/19T2-cs2511-lab04

## Exercise

Included in this repo is the code from this week's tutorial for the refactored movie rental example. This code uses the strategy pattern to price different movie rentals.

* Add a new type of movie, `Classic`. Classic movies can be rented for up to 5 days for $2. Each additional day after those 5 days costs $1.

Watch this video from our esteemed tutor Hugh on the state pattern.

https://www.soln.io/s/HJa84HRVW2j?course_id=B1RYiLjNX&series_id=H1dF7bo4m

After considering the differences between the state and strategy patterns:

* Modify the `Movie` class such that it uses the state pattern to track its pricing. In doing so you will need to consider:
  * What state a movie is in initially?
  * What transitions can be made on the state?
  * How this affects the testing code in the `main()` method of the customer class.

Check to make sure your solution conforms to the state pattern.

Modify this file (`README.md`) and, using your solution as an example, answer the following questions:

* What advantages does the state pattern have over the strategy pattern?

    > The state pattern removes the need for multiple if statements to determine the many different things
    an object could do when an action is performed. 
    
    > For example, if there is a vending machine, rather than having multiple if statements to determine 
    what should happen when someone gives it money, each state of the vending machine simply implements 
    its own version of the this function.
    
    > Additionally, it allows for the state of an object to be changed dynamically during runtime. Using
    the same vending machine example, if the approprirate money is given to the machine, its state can 
    easily be modified so that the execution of all its functions now match this new state.

* Conversely, what disadvantages does the state pattern have over the strategy pattern?

    > If the object does not regularly change states (or if it doesn't have many different states) then the 
    state pattern is quite redundant. For example, I think the strategy pattern was for more effective for
    the movie rentals, as most movies will not change their state often (if at all).

## Submission

Make sure that all your work has been pushed to GitLab then submit it with:

```bash
$ 2511 submit lab04
```
