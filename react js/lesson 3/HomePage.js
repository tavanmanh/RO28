import React from "react";

class HomePage extends React.Component {

    render() {
        return (
            <div>
                {this.props.top}
                {this.props.main}
                {this.props.bottom}
            </div>
        );
    }
}

export default HomePage;