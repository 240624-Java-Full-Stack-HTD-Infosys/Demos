import { fireEvent, render } from '@testing-library/react';
import Counter from './Counter';

test("Renders initial count and button", () => {
    // AAA

    // Arrange
    // Act
    const CounterComponent = render(<Counter/>);


    // Assert

    // The component renders with an initial count of 0

    const countElement = CounterComponent.getByText("Count: 0");

    expect(countElement).toBeInTheDocument();

    // The component renders "Increment" and "Decrement" buttons

    const incrementButton = CounterComponent.getByText("Increment");
    const decrementButton = CounterComponent.getByText("Decrement");

    expect(incrementButton).toBeInTheDocument();
    expect(decrementButton).toBeInTheDocument();
    
})


test('Increments and decrements count when buttons are clicked', () => {

    // Arrange
    const {getByText} = render(<Counter/>);

    const incrementButton = getByText("Increment");
    const decrementButton = getByText("Decrement");
    const countElement = getByText('Count: 0');

    // Act
    fireEvent.click(incrementButton);

    // Assert
    expect(countElement).toHaveTextContent('Count: 1');

    // Act
    fireEvent.click(decrementButton);

    // Assert
    expect(countElement).toHaveTextContent("Count: 0");

})
