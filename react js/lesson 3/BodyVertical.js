import React from "react";
import Column1 from "./Column1";
import Column2 from "./Column2";
import Column3 from "./Column3";

class BodyHorizontal extends React.Component {

    render() {
        return (
            <div style={{ backgroundColor: "blue" }}>
                <Column1 />
                <Column2 />
                <Column3 />
            </div>
        );
    }
}

export default BodyHorizontal;