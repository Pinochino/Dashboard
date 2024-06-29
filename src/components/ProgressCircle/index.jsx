import { useTheme } from "@emotion/react";
import { Box, colors } from "@mui/material";
import { tokens } from "~/theme";

function ProgressCircle( { progress = '0.75', size= '40'}) {
    const theme = useTheme();
    const colors = tokens(theme.palette.mode);
    const angle = progress * 360;


    return (
        <Box
        sx={{background: `radial-gradient(${colors.primary[400]}) 55%, transparent 56%`}}
        >

        </Box>
      );
}

export default ProgressCircle;