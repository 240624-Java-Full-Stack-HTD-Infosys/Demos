import { render, screen } from '@testing-library/react';
import Async from './Async';

describe("Async Component", () => {
    test('Renders posts if request is sucessful', async () => {
        // Create a mock js object
        // assign this mock object to what we are trying to mock
        window.fetch = jest.fn();

        // The mock object acts as a blank canvas, it will do nothing unless you tell it to do something

        window.fetch.mockResolvedValueOnce({
            json: async () => [{id: 'p1', title: 'first post'}]
        });

        render(<Async/>)
        // render(<Async/>)

        // Fetch request gets a list of posts
        // We want all the lists on the page

        const listItemElement = await screen.findAllByRole("listitem");

        expect(listItemElement).not.toHaveLength(0);
    });


    test("error message is displayed when fetch request fails", async () => {
        // Create a mock js object
        // assign this mock object to what we are trying to mock
        window.fetch = jest.fn();

        // The mock object acts as a blank canvas, it will do nothing unless you tell it to do something

        window.fetch.mockRejectedValueOnce({
            error: {message: "Error!"}
        });      

        render(<Async/>)

        const errorMessageElement = await screen.getByText("Error! - Please try again", {exact: false});

        expect(errorMessageElement).toBeInTheDocument();
    });
})