import { useTheme } from "@emotion/react";
import { Box, Typography } from "@mui/material";
import FormPage from "~/scenes/form";
import { tokens } from "~/theme";

function Form() {
    const theme = useTheme();
    const colors = tokens(theme.palette.mode);
    return ( 
        <div className="wrapper">
            <FormPage />
        </div>
     );
}

export default Form;